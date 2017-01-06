package cn.yy.ssm.service;

import java.util.List;

import cn.yy.ssm.po.Language;

public interface LanguageService {

	public int findLanguageByName(Language l);
	
	public List<Language> findAll();
}
