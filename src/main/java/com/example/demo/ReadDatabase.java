package com.example.demo;

import com.example.demo.dal.Word;
import com.example.demo.mappers.WordMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class ReadDatabase {

    public static String read() throws IOException{

        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        WordMapper wordMapper = sqlSessionFactory.openSession().getMapper(WordMapper.class);

        List<Word> word = wordMapper.getValue();

        return word.get(0).getValue();
    }
}
