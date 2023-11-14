package com.jhgpt.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhgpt.board.model.dao.VideoDao;
import com.jhgpt.board.model.dto.Video;

@Service
public class VideoServiceImpl implements VideoService{

	private final VideoDao videoDao;
	
	@Autowired
    public VideoServiceImpl(VideoDao videoDao) {
        this.videoDao = videoDao;
    }
	
	@Override
	public List<Video> getVideoList() {
		// TODO Auto-generated method stub
		return videoDao.selectAll();
	}

	@Override
	public void registVideo(Video video) {
		// TODO Auto-generated method stub
		videoDao.insertVideo(video);
	}

	@Override
	public Video selectVideo(int video_id) {
		// TODO Auto-generated method stub
		return videoDao.selectOne(video_id);
	}

	@Override
	public void deleteVideo(int video_id) {
		// TODO Auto-generated method stub
		videoDao.deleteVideo(video_id);
	}

}
