const solution = (n) => {
    const squareRoot = Math.sqrt(n);
    if(squareRoot % 1 !== 0) { return -1;} 

    return Math.pow(squareRoot + 1, 2);
}