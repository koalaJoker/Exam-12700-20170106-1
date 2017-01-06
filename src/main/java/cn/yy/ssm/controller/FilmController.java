package cn.yy.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.yy.ssm.po.Film;
import cn.yy.ssm.po.Language;
import cn.yy.ssm.po.PageData;
import cn.yy.ssm.po.ResponseData;
import cn.yy.ssm.service.FilmService;
import cn.yy.ssm.service.LanguageService;

@Controller
public class FilmController {

	@Autowired
	private FilmService filmsService;
	@Autowired
	private LanguageService LanguageService;
	
		@RequestMapping("/queryALL")
		@ResponseBody	
    public ResponseData<Film> queryALL(@RequestParam(name = "title", required = false, defaultValue = "") String title,
            @RequestParam(name = "currentPage",required = false, defaultValue = "1") int currentPage,
            @RequestParam(name = "pageSize", required = false, defaultValue = "5") int pageSize) throws Exception{
			
			PageData<Film> pageData=new PageData<Film>();
			pageData.setCurrentPage(currentPage).setPageSize(pageSize);
			Film film=new Film();
			film.setTitle(title);
			pageData.setEntity(film);
    	    List<Film> filmList=filmsService.findFilm(pageData);
    	    int count=filmsService.Filmcount(pageData);
		return new ResponseData<Film>().setRows(filmList).setTotal(count); 
		
    }
		@RequestMapping("/deleteFilm")
		@ResponseBody	
		public String deleteFilm(int film_id){
			Film film=new Film();film.setFilm_id(film_id);
			
			try {
				filmsService.deleteFilm(film);
			} catch (Exception e) {
				//System.out.println("有外键,删除不成功！");
				return "false";
				
			}
			
			return "true";
		}
		
		@RequestMapping("/addFilm")
		public ModelAndView addFilm(String title,String description,String language_name,HttpServletResponse response){
			response.setContentType("text/html;charset=UTF-8");
			Language l=new Language();l.setName(language_name);
			int langugae_id=LanguageService.findLanguageByName(l);
			System.out.println(langugae_id);
			Film film=new Film();film.setTitle(title);film.setLanguage_id(langugae_id);
			film.setDescription(description);
			filmsService.insertFilm(film);
             ModelAndView modelAndView =new ModelAndView();
			modelAndView.setViewName("film");
			return modelAndView;
			
		}
		

		@RequestMapping("/toAddFilm")
		@ResponseBody
		public List<Language> toAddFilm(){
			List<Language> languageList=LanguageService.findAll();
             ModelAndView modelAndView =new ModelAndView();
			return languageList;
			
		}
		
		@RequestMapping("/toUpdateFilm")
		@ResponseBody
		public Film toUpdateFilm(int film_id){
				
         Film film=new Film(); film.setFilm_id(film_id);;
             Film films=filmsService.findFilmById(film);
           
			return films;
			
		}
		
		@RequestMapping("/updateFilm.action")
		public ModelAndView updateFilm(int film_id, String title,String description,String language_name,HttpServletResponse response){
			response.setContentType("text/html;charset=UTF-8");	
            Film film=new Film(); film.setFilm_id(film_id);
            Language l=new Language();l.setName(language_name);
	        film.setTitle(title);film.setDescription(description);
	        film.setLanguage(l);
            filmsService.updateFilm(film);
            ModelAndView modelAndView =new ModelAndView();
			modelAndView.setViewName("film");
			return modelAndView;
		}
		
}
