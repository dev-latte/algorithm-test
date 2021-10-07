const solution = (n) => {
    // 문자
    // return String(n).split("").map(num => +num).reverse();
    
    // 숫자
    const result = [];
    while(0 < n) {
        result.push(n % 10);
        n = Math.floor(n / 10);
    }
    
    return result;
}