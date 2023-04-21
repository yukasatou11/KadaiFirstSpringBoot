package com.techacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    // 指定日の曜日を算定する
    @GetMapping("/dayofweek/{date}")
    public String dispDayOfWeek(@PathVariable String date) {

        // Stringからjava.time.LocalDateに変換する
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyyMMdd"));

        //曜日を取得
        DayOfWeek week = localDate.getDayOfWeek();

        //曜日で表示（MONDAY TUESDAY...SUNDAY）
        System.out.println(week);

        return week.toString();
    }

    // 四則演算を行なう

    // 足し算
    @GetMapping("/plus/{val1}/{val2}")
    public int calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return res;
    }

    // 引き算
    @GetMapping("/minus/{val1}/{val2}")
    public int calcMinus(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return res;
    }

    // 掛け算
    @GetMapping("/times/{val1}/{val2}")
    public int calcTimes(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return res;
    }

    // 割り算
    @GetMapping("/divide/{val1}/{val2}")
    public int calcDivide(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return res;
    }

}



