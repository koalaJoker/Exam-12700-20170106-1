package cn.yy.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.yy.ssm.mapper.FilmMapper;
import cn.yy.ssm.po.Film;
import cn.yy.ssm.po.PageData;
import cn.yy.ssm.service.FilmService;

public class FilmServiceImpl implements FilmService{

	@Autowired
	private FilmMapper filmMapper;

	public List<Film> findFilm(PageData<Film> pageData) {
		
		return filmMapper.findFilm(pageData);
	}

	public int Filmcount(PageData<Film> pageData) {
		
		return filmMapper.Filmcount(pageData);
	}

	public Film findFilmById(Film film) {

		return filmMapper.findFilmById(film);
	}

	public void updateFilm(Film film) {
		filmMapper.updateFilm(film);
		
	}

	public void deleteFilm(Film film) {
		filmMapper.deleteFilm(film);
		
	}

	public void insertFilm(Film film) {
		filmMapper.insertFilm(film);
		
	}
}
