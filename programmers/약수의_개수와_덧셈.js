const solution = (left, right) => {
    let sum = 0;
    for(let i = left; i <= right; i++) {
        (divisor(i)) ? sum += i : sum -= i;
    }
    return sum;
}

const divisor = (number) => {
    let count = 0;
    for(let i = number; 0 < i; i--){
        if(number % i === 0) {
            count++;     
        }
    }
    return count % 2 === 0;
}