package cn.yy.ssm.mapper;

import java.util.List;

import cn.yy.ssm.po.Film;
import cn.yy.ssm.po.PageData;

public interface FilmMapper {
   //分页
	public List<Film> findFilm(PageData<Film> pageData);
	//查询总记录数
	public int  Filmcount(PageData<Film> pageData);
	//通过id找到数据
	public  Film  findFilmById(Film film);
	//修改
	public void updateFilm(Film film);
	//删除
	public void deleteFilm(Film film);
	//新增
	public void insertFilm(Film film);
	
}
