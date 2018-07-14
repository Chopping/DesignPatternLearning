<?php
/**
 * Created by PhpStorm.
 * User: Administrator
 * Date: 2018/7/14
 * Time: 11:33
 */

namespace app\index\unit;


class ThrowingCalcStrategy extends CalcGradeStrategy
{
    /**
     * 获取成绩的公开接口
     * @return 计算出来的成绩|string
     */
    public function GetCalcScore($originScore)
    {
        // TODO: Implement GetCalcScore() method.
    }

    /**
     * 派生的成绩比较方法
     * @param $score1
     * @param $score2
     * @return mixed
     */
    public function Compare($score1, $score2)
    {
        // TODO: Implement Compare() method.
    }

    /**
     * 派生的获取成绩组中最大值的方法
     * @param $scoreArray
     * @return mixed
     */
    public function GetMax($scoreArray)
    {
        // TODO: Implement GetMax() method.
    }
}