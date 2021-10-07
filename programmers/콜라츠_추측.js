const solution = (num) => {
    let index = 0;
    let count = 0;
    
    while(num !== 1 && index <= 500){
        num = num % 2 === 0 ? num / 2 : num * 3 + 1;
        index++;
        count++;
    }
    
    return index < 500 ? count : -1;
}