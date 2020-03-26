package com.imti.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imti.model.EmployeeInfo;
import com.imti.model.PageBean;
import com.imti.model.VehicleInfo;
import com.imti.service.VehicleInfoService;

import net.sf.json.JSONObject;

/**@文件名: VehicleInfo.java
 * @类功能说明: 车辆管理
 * @作者: XuJiaWei
 * @Email: 2568492004@qq.com
 * @日期: 2020年3月17日上午11:00:43
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: XuJiaWei</li> 
 * 	 <li>日期: 2020年3月17日上午11:00:43</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Controller
@RequestMapping("vehicleInfo")
public class VehicleInfoController {
	@Autowired
	public VehicleInfoService vehicleInfoService;
	
	/**
	 * 展示所有车辆信息
	 */
	@RequestMapping("/findAllvehicleInfo")
	@ResponseBody
	public Map<String,Object> findAllvehicleInfo(String searchByName,HttpServletRequest request,@RequestParam(value="page",required=false)String page){

		String rows=request.getParameter("rows");
		Map<String,Object> map=new HashMap<String,Object>();
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		map.put("searchByName",searchByName); 
		map.put("pageBean", pageBean);
		int total=vehicleInfoService.findAllvehicleInfoCount();
		List<VehicleInfo> vehicleList=vehicleInfoService.findAllvehicleInfo(map);
		Map<String,Object> resultMap=new HashMap<String,Object>();
		resultMap.put("rows",vehicleList);
		resultMap.put("total",total);
		return resultMap;
	
	}
	
	/**
	 * 删除逻辑Controller层
	 */
	@RequestMapping("/deleteVehicleInfo")
	@ResponseBody
	public JSONObject deleteVehicleInfo(String ve_idss){
 		int result=vehicleInfoService.deleteVehicleInfo(ve_idss);
		JSONObject jsonObject=new JSONObject();
		if(result>0){
			jsonObject.put("msg", true);
			jsonObject.put("count", result);
		}else{
			jsonObject.put("msg", false);
		}
		System.out.println("1234");
		return jsonObject;
	}
	/**
	 * @方法名: veAccountIsExist
	 * @方法说明: 判断当前用户是否存在
	 * @作者:XuJiaWei
	 * @邮箱：2568492004@qq.com
	 * @日期: 2020年3月17日下午6:19:17
	 * @param em_account
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/veAccountIsExist")
	@ResponseBody
	public JSONObject veAccountIsExist(String ve_license){
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("ve_license",ve_license);
		JSONObject jsonObject=new JSONObject();
		int result=vehicleInfoService.veAccountIsExist(map);
		if(result>0){
			jsonObject.put("msg",true);
		}else{
			jsonObject.put("msg",false);
		}
		
		return jsonObject;
	}
	
	/**
	 * @方法名: saveEmployeeInfo
	 * @方法说明: 保存按钮Controller层
	 * @作者:XuJiaWei
	 * @邮箱：2568492004@qq.com
	 * @日期: 2020年3月17日下午5:47:51
	 * @param request
	 * @param employeeInfo
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/saveVehicleInfo")
	@ResponseBody
	public JSONObject saveVehicleInfo(HttpServletRequest request,VehicleInfo vehicleInfo){
		HttpSession session=request.getSession();//从前台获取session
		EmployeeInfo sessionEmployee=(EmployeeInfo) session.getAttribute("crurentEmployeeInfo");
		vehicleInfo.setVe_opt_id(sessionEmployee.getEm_id());
		JSONObject jsonObject=new JSONObject();
		Integer result=vehicleInfoService.saveVehicleInfo(vehicleInfo);
		if(result>0){
			jsonObject.put("msg",true);
		}else{
			jsonObject.put("msg",false);
		}
		return jsonObject;
	}
	/*修改车辆信息Controller层*/
	@RequestMapping("/updateVehicleInfo")
	@ResponseBody
	public JSONObject updateVehicleInfo(VehicleInfo vehicleInfo){
		
		JSONObject jsonObject=new JSONObject();
		int result=vehicleInfoService.updateVehicleInfo(vehicleInfo);
		if(result>0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		System.out.println(jsonObject+"8529634185");
		return jsonObject;
		
		
	}
	
	
}
