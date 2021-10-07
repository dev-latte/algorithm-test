const solution = (x) => {
    return (x % sumX(x) === 0);
}

const sumX = (x) => {
    let sum = 0;
    while(0 < x) {
        sum += (x % 10);
        x = Math.floor(x / 10);
    }
    return sum;
}