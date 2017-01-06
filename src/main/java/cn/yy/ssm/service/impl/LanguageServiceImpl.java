package cn.yy.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.yy.ssm.mapper.LanguageMapper;
import cn.yy.ssm.po.Language;
import cn.yy.ssm.service.LanguageService;

public class LanguageServiceImpl implements LanguageService{
      @Autowired
	private LanguageMapper languageMapper;
	public int findLanguageByName(Language l) {
		
		return languageMapper.findLanguageByName(l);
	}
	public List<Language> findAll() {
		// TODO Auto-generated method stub
		return languageMapper.findAll();
	}

}
