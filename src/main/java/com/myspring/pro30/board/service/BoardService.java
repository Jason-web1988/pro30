package com.myspring.pro30.board.service;

import java.util.List;
import java.util.Map;

import com.myspring.pro30.board.vo.ArticleVO;

public interface BoardService {
	public List<ArticleVO> articlesList() throws Exception;
	public int addNewArticle(Map articleMap) throws Exception;
	//단일파일
	//public ArticleVO viewArticle(int articleNO) throws Exception;
	
	//다중파일
	public Map viewArticle(int articleNO) throws Exception;
	
	public void modArticle(Map articleMap) throws Exception;
	public void removeArticle(int articleNO) throws Exception;
}
