const solution = (n) => {
    const word = "수박";
    let answer = '';
    
    for(let i = 0; i < n; i++){
        answer += word[i % 2];
    }

    return answer;
}