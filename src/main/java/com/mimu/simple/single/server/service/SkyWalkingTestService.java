package com.mimu.simple.single.server.service;


import com.mimu.simple.single.server.dao.SchoolDao;
import com.mimu.simple.single.server.model.SchoolSchoolInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkyWalkingTestService {

    private SchoolDao schoolDao;

    @Autowired
    public void setSchoolDao(SchoolDao schoolDao) {
        this.schoolDao = schoolDao;
    }

    public SchoolSchoolInfo getSchoolInfo(int serial){
        return schoolDao.getSchoolInfo(serial);
    }
}
