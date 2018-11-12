package com.ktds.reply.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
<<<<<<< HEAD

import com.ktds.reply.vo.ReplyVO;
=======
>>>>>>> d5ec04a9ca167ed519f37fe1557765b7046632fc

@Repository
public class ReplyDaoImpl extends SqlSessionDaoSupport implements ReplyDao{

	@Autowired
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

	@Override
	public int insertReply(ReplyVO replyVO) {
		return this.getSqlSession().insert("ReplyDao.insertReply", replyVO);
	}

	@Override
	public List<ReplyVO> selectReplyList(String qnaId) {
		return this.getSqlSession().selectList("ReplyDao.selectReplyList", qnaId);
	}
}
