package com.imti.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imti.model.EmployeeInfo;
import com.imti.model.MenuInfo;
import com.imti.service.MenuInfoService;
import com.imti.service.RoleInfoService;
import com.imti.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @文件名: MenuInfoController.java
 * @类功能说明: 菜单信息Controller层
 * @作者: YangZhiYuan
 * @Email: 982206231@qq.com
 * @日期: 2020年3月4日上午10:21:42
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: YangZhiYuan</li> 
 * 	 <li>日期: 2020年3月4日上午10:21:42</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Controller
@RequestMapping("menuInfo")
public class MenuInfoController {
	/**
	 * 引入菜单的service接口
	 */
	@Autowired
	private MenuInfoService menuInfoService;
	/**
	 * 引入角色的service接口
	 */
	@Autowired
	private RoleInfoService roleInfoService;
	/**
	 * @方法名: findMenuInfoByRole
	 * @方法说明: 登陆主界面的展示不同用户的菜单信息方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:42:11
	 * @param request
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("/findMenuInfoByRole")
	@ResponseBody
	public Map<String,Object> findMenuInfoByRole(HttpServletRequest request){
		Map<String,Object> map = new HashMap<String,Object>();
		String parnetId="-1";
		HttpSession session = request.getSession();
		EmployeeInfo sessionEmployee = (EmployeeInfo) session.getAttribute("crurentEmployeeInfo");
		int roleId = sessionEmployee.getRo_id();
		String menuIds = roleInfoService.findMenuIdByRoleId(roleId);
		List<Integer> menuList = StringUtil.stringToArry(menuIds);
		JSONArray jsonArray = menuInfoService.findMenuInfoByRole(parnetId, menuList);
		map.put("menuInfoList", jsonArray);
		return map;
	}
	/**
	 * @方法名: findAllMenuInfo
	 * @方法说明: 菜单管理中展示所有菜单信息的方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:43:33
	 * @param menuIds
	 * @param request
	 * @return
	 * @return: Map<String,Object>
	 */
	@RequestMapping("/findAllMenuInfo")
	@ResponseBody
	public Map<String,Object> findAllMenuInfo(String menuIds,HttpServletRequest request){
		int mn_parent = -1;
		Map<String,Object> map = new HashMap<String,Object>();
		/* 参数是实现类里面的是定值 */
		JSONArray jsonArray = menuInfoService.findAllMenuInfo(mn_parent,menuIds);
		map.put("menuInfoList", jsonArray);
		return map;
	}
	/**
	 * @方法名: findAllMenuInfoForEdit
	 * @方法说明: 找到所有菜单信息，用于编辑
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月8日下午6:34:39
	 * @return
	 * @return: JSONArray
	 */
	@RequestMapping("/findAllMenuInfoForEdit")
	@ResponseBody
	public JSONArray findAllMenuInfoForEdit(){
		int mn_parent = -1;
		return menuInfoService.findAllMenuInfoForEdit(mn_parent);
	}
	/**
	 * @方法名: addMenuInfo
	 * @方法说明: 新增菜单信息方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:45:38
	 * @param request
	 * @param menuInfo
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/addMenuInfo")
	@ResponseBody
	public JSONObject addMenuInfo(HttpServletRequest request, MenuInfo menuInfo){
		HttpSession session = request.getSession();
		EmployeeInfo sessionEmployeeInfo = (EmployeeInfo) session.getAttribute("crurentEmployeeInfo");
		menuInfo.setMn_opt_id(sessionEmployeeInfo.getEm_id());
		JSONObject jsonObject = new JSONObject();
		int result = menuInfoService.addMenuInfo(menuInfo);
		if(result > 0){
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @方法名: deleteMenuInfo
	 * @方法说明: 删除菜单信息方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:46:01
	 * @param mn_id
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/deleteMenuInfo")
	@ResponseBody
	public JSONObject deleteMenuInfo(int mn_id){
		JSONObject jsonObject = new JSONObject();
		int result = menuInfoService.deleteMenuInfo(mn_id);
		if(result > 0){
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
	/**
	 * @方法名: updateMenuInfo
	 * @方法说明: 修改菜单信息的方法
	 * @作者: YangZhiYuan
	 * @邮箱：982206231@qq.com
	 * @日期: 2020年3月9日下午3:46:31
	 * @param menuInfo
	 * @return
	 * @return: JSONObject
	 */
	@RequestMapping("/updateMenuInfo")
	@ResponseBody
	public JSONObject updateMenuInfo(MenuInfo menuInfo){
		JSONObject jsonObject = new JSONObject();
		int result = menuInfoService.updateMenuInfo(menuInfo);
		if(result > 0){
			jsonObject.put("msg", true);
		}else{
			jsonObject.put("msg", false);
		}
		return jsonObject;
	}
}
