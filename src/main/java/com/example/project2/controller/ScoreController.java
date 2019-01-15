package com.example.project2.controller;

import com.example.project2.dto.ScoreDTO;
import com.example.project2.entity.Score;
import com.example.project2.service.ScoreService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/score")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @PostMapping(value = "/addscore")
    public Score add(@RequestBody ScoreDTO scoreDTO) {
        Score score=new Score();
        BeanUtils.copyProperties(scoreDTO,score);
        return scoreService.add(score);
    }

    @RequestMapping(value = "/selectscore",method = RequestMethod.GET)
    public void select(@RequestParam String id) {
        Score score=scoreService.select(id);
        System.out.println(score);
    }

    @RequestMapping(value = "/updatescore",method = RequestMethod.PUT)
    public Score update(@RequestBody ScoreDTO scoreDTO) {
        Score score=new Score();
        BeanUtils.copyProperties(scoreDTO,score);
        return scoreService.update(score);
    }

    @RequestMapping(value = "/deletescore",method = RequestMethod.DELETE)
    public void delete(@RequestParam String id) {
        scoreService.delete(id);
    }
}
