const solution = (lottos, win_nums) => {
    const zero_count = lottos.filter(el => !el).length;
    const min = lottos.filter(el => el).map(el => win_nums.filter(num => num === el)).filter(el => el.length).length;
    
    return [getRank(zero_count+min), getRank(min)];
}

const getRank = (count) => {
    return count <= 1 ? 6 : 7 - count;
}