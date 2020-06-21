/**
 * 算法中最常见的递归
 */
private int recursive($params){
        $边界条件判断
        $update operation
        $left=recursive($params);
        $right=recursive($params);

        return Math.max($left,$right);
}

/**
 * 循环
 */

while/for($loopCondition){
    if($condition1){
        $update;
    }else if($condition2){
        $update;
    }else if($condition3){
        $update;
    }else{
        $update;
    }
}

/**
 * 循环
 */
        List<Integer> aa = new LinkedList<Integer>();
        for (int i = 0; i < a.length; i++) {
           $otherOperation;
           if($condition){
                aa.add(a[i]);
            }

        }