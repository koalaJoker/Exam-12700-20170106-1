package cn.yy.ssm.mapper;

import java.util.List;

import cn.yy.ssm.po.Language;

public interface LanguageMapper {

	public int findLanguageByName(Language l);
	
	public List<Language> findAll();
}
