package cn.bevol.statics.controller;

import cn.bevol.statics.service.StaticCompositionService;
import cn.bevol.util.response.ReturnData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class CompositionController {


	@Resource
	private StaticCompositionService staticCompositionService;

	/**
	 * 全量静态化成分
	 * @return
	 */
	@RequestMapping(value="/static/composition/pages")
	@ResponseBody
	public ReturnData staticAllCompositionPages(){
		return staticCompositionService.initCompositionStatic(4);
	}

	/**
	 * 静态化成分
	 * @param session
	 * @param request
	 * @param mid
	 * @return
	 */
	@RequestMapping(value = {"/static/composition/{mid}"})
	@ResponseBody
	public Object searchWorkByName(HttpSession session, HttpServletRequest request,
                                   @PathVariable String mid){
		return new ReturnData(staticCompositionService.compositionStatic(mid));
	}


	/***
	 * 多成分查询
	 * @param session
	 * @param request
	 * @param names
	 * @return
	 */
	@RequestMapping("/static/composition/compares")
	@ResponseBody
	public Object findCompositionList(HttpSession session, HttpServletRequest request, @RequestParam String names){
		return new ReturnData(staticCompositionService.findCompositionList(names));
	}

	/***
	 * 单一成分查询
	 * @param session
	 * @param request
	 * @param names
	 * @return //TODO 方法未实现
	 */
	@RequestMapping("/static/composition/compare")
	@ResponseBody
	public Object findComposition(HttpSession session, HttpServletRequest request, @RequestParam String names){
		return new ReturnData(staticCompositionService.findComposition(names));
	}

	/*@Deprecated
	@RequestMapping("/static/composition/cps")
	@ResponseBody
	public Object findCompositionByIds(HttpSession session, HttpServletRequest request,@RequestParam String[] ids){
		return new ReturnData(staticCompositionService.findCompositionByIds(ids));
	}*/

}
