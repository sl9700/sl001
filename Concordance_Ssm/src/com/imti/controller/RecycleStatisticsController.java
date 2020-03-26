package com.imti.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imti.model.PageBean;
import com.imti.model.RecycleStatistics;
import com.imti.service.RecycleStatisticsService;
/**
 * @文件名: RecycleStatisticsController.java
 * @类功能说明: 信息控制层
 * @作者: wangyuntian
 * @Email: 841589654@qq.com
 * @日期: 2020年3月20日上午10:54:18
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: wangyuntian</li> 
 * 	 <li>日期: 2020年3月20日上午10:54:18</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Controller
@RequestMapping("RecycleStatistics")
public class RecycleStatisticsController {
	
	@Autowired
	private RecycleStatisticsService recycleStatisticsService;
	/**
	 * @方法名: findAllRecycleStatistics
	 * @方法说明: 展示查询到前端页面并且分页
	 * @作者: wangyuntian
	 * @邮箱：841589654@qq.com
	 * @日期: 2020年3月20日上午10:53:50
	 * @param request
	 * @param searchByName
	 * @param page
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("findAllRecycleStatistics")
	@ResponseBody
		public Map<String, Object> findAllRecycleStatistics(HttpServletRequest request,String searchByName,@RequestParam(value="page",required=false)String page){
			String rows=request.getParameter("rows");
			Map<String,Object> map=new HashMap<String,Object>();
			PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
			map.put("searchByName",searchByName);
			map.put("pageBean", pageBean);
			int total=recycleStatisticsService.findAllRecycleStatisticsCount(map);
			List<RecycleStatistics> recycleStatisticsList=recycleStatisticsService.findAllRecycleStatistics(map);
			Map<String,Object> resultMap=new HashMap<String,Object>();
			resultMap.put("rows", recycleStatisticsList);
			resultMap.put("total", total);
			return resultMap;
			}
	}
