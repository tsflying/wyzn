package cn.rxcards.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value = "/index")
	public ModelAndView index(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView("index");
		return modelView;
	}

	@RequestMapping(value = "/abtouUs")
	public ModelAndView abtouUs(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView("abtouUs");
		return modelView;
	}

	@RequestMapping(value = "/news")
	public ModelAndView news(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView("news");
		return modelView;
	}

	@RequestMapping(value = "/products")
	public ModelAndView products(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView("products");
		return modelView;
	}

	@RequestMapping(value = "/services")
	public ModelAndView services(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView("services");
		return modelView;
	}

	@RequestMapping(value = "/contact")
	public ModelAndView contact(HttpServletRequest request) {
		ModelAndView modelView = new ModelAndView("contact");
		return modelView;
	}
}
