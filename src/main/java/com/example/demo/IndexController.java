package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/jpa")
public class IndexController {
	@Autowired
	private TeacherService teacherService;
	
	@RequestMapping(value="/list", method=RequestMethod.POST)
	@ResponseBody
	public Map list(){
		Map<String, Object> map = new HashMap<>();
		List<Teacher> infos = teacherService.findAll();
		map.put("rows", infos);
		map.put("total", infos.size());
		return map;
	}
	
	/**
	 * 保存定时任务
	 * @param info
	 * 2016年10月9日下午1:36:59
	 */
	@RequestMapping(value="save", method=RequestMethod.POST, produces = "application/json; charset=UTF-8")
	public Map save(Teacher info){
		teacherService.saveAndFlush(info);
		Map<String, Object> map = new HashMap<>();
		map.put("errorCode", 0);
		map.put("errorText", null);
		return map;
	}
	
	/**
	 * 删除定时任务
	 * @param id
	 * 2016年10月9日下午1:52:20
	 */
	@RequestMapping(value="delete/{id}", produces = "application/json; charset=UTF-8")
	public Map delete(@PathVariable int id){
		teacherService.delete(id);
		Map<String, Object> map = new HashMap<>();
		map.put("errorCode", 0);
		map.put("errorText", null);
		return map;
	}
}
