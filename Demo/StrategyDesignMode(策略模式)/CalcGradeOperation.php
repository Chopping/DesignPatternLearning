<?php
/**
 * Created by PhpStorm.
 * User: Administrator
 * Date: 2018/7/14
 * Time: 11:38
 */

namespace app\index\unit;


interface CalcGradeOperation
{

    /**
     * 获取成绩的公开接口
     * @param $originScore
     * @return 计算出来的成绩|string
     */
    public function GetCalcScore($originScore);

    /**
     * 派生的成绩比较方法
     * @param $score1
     * @param $score2
     * @return mixed
     */
    public function Compare($score1,$score2);

    /**
     * 派生的获取成绩组中最大值的方法
     * @param $scoreArray
     * @return mixed
     */
    public function GetMax($scoreArray);
}