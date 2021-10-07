const solution = (price, money, count) => {
    const answer = (countRide(price, count) - money);
    return answer <= 0 ? 0 : answer;
}

const countRide = (price, count) => {
    let sum = 0;
    for(let i = 1; i <= count; i++) {
        sum += (price * i);
    }
    return sum;
}