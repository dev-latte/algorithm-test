const solution = (array, commands) => {
    const answer = [];
    commands.forEach(el => {
        const [start, end, k] = el;
        const list = Array.from(array).slice(start-1, end).sort((a,b) => a-b);
        answer.push(list[k-1]);
    });

    return answer;
}