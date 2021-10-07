const solution = (n) => {
    let sum = 0;
    while(0 < n) {
        sum += (n % 10);
        n = Math.floor(n/10);
    }
    return sum;
}