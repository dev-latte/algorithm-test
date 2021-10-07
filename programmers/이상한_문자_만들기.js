const solution = (s) => {
    return s.split(" ").map(word => {
        let answer = "";
        for(let i = 0; i < word.length; i++) {
            answer += (i % 2 === 0) 
                ? word[i].toUpperCase() 
                : word[i].toLowerCase();   
        }
        return answer;
    }).join(" ");
}