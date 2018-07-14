<?php
/**
 * Created by PhpStorm.
 * User: Administrator
 * Date: 2018/7/14
 * Time: 11:11
 */

namespace app\index\unit;


abstract class CalcGradeStrategy implements CalcGradeOperation
{
    /**
     * @var 计算出来的成绩
     */
    protected $score;
}