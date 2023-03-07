package com.techacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    // 仕様1：指定日の曜日を算定する
    @GetMapping("/dayofweek/{val}")
    public DayOfWeek dispDayOfWeek(@PathVariable String val) {
        // 日付をLocalDate型に変換
        String year = val.substring(0,4);
        String month = val.substring(4,6);
        String day = val.substring(6);

        System.out.println(year);

        String str = year + "-" +  month + "-" + day;

        LocalDate data = LocalDate.parse(str);

        // 曜日を取得
        DayOfWeek week = data.getDayOfWeek();
        return week;
    }

    // 仕様2：四則演算を行なう

    // 足し算
    @GetMapping("/plus/{val1}/{val2}")
    public int calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int result = val1 + val2;
        return result;
    }

    // 引き算
    @GetMapping("/minus/{val1}/{val2}")
    public int calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int result = val1 - val2;
        return result;
    }

    // 掛け算
    @GetMapping("/times/{val1}/{val2}")
    public int calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int result = val1 * val2;
        return result;
    }

    // 割り算
    @GetMapping("/divide/{val1}/{val2}")
    public int calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int result = val1 / val2;
        return result;
    }
}