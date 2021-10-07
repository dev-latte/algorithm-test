const solution = (x, n) => {
    const array = [];
    for(let i = 1; i <= n; i++){
        array.push(x * i);
    }
    return array;
}