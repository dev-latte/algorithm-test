const solution = (n, lost, reserve) => {
    lost.sort((a, b) => a - b);
    reserve.sort((a, b) => a - b);

    Array.from(lost).forEach((el) => {
        if(reserve.includes(el)) {
            reserve.splice(reserve.indexOf(el), 1);
            lost.splice(lost.indexOf(el), 1);
        }
    });
    
    Array.from(lost).forEach(el => {
        if(reserve.includes(el-1)){
            reserve.splice(reserve.indexOf(el-1), 1);
            lost.splice(reserve.indexOf(el-1), 1);
        } else if(reserve.includes(el+1)){
            reserve.splice(reserve.indexOf(el+1), 1);
            lost.splice(reserve.indexOf(el+1), 1);
        }
    });
    
    return n - lost.length;

}