<?php
/**
 * Created by PhpStorm.
 * User: Administrator
 * Date: 2018/7/14
 * Time: 9:03
 */

namespace app\index\unit;


use app\index\unit\RunningCalcStrategy;
use app\index\unit\JumpingCalcStrategy;
use app\index\unit\ThrowingCalcStrategy;
use app\index\unit\CalcGradeOperation;

class CalcGradeHandler
{
	
    /**
     * @param CalcGradeStrategy $calcGradeStrategy
     * @param $originScore
     * @return 计算出来的成绩|null|string
     */
    public static function GetScore(CalcGradeStrategy $calcGradeStrategy,$originScore){
        return $calcGradeStrategy == null? null: $calcGradeStrategy->GetCalcScore($originScore);
    }

    /**
     * 取出一组成绩中最高的成绩
     * @param CalcGradeStrategy $calcGradeStrategy
     * @param $arrayScore
     * @return mixed|null
     */
    public static function GetArrayMaxScore(CalcGradeStrategy $calcGradeStrategy,$arrayScore){
        return $calcGradeStrategy == null? null: $calcGradeStrategy->GetMax($arrayScore);
    }
}