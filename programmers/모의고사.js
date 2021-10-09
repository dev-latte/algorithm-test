const solution = (answers) => {
    const answer = [];
    const STUDENT_1 = [1, 2, 3, 4, 5];
    const STUDENT_2 = [2, 1, 2, 3, 2, 4, 2, 5];
    const STUDENT_3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    
    const count_1 = answers.filter((answer, i) => answer === STUDENT_1[i % STUDENT_1.length]).length;
    const count_2 = answers.filter((answer, i) => answer === STUDENT_2[i % STUDENT_2.length]).length;
    const count_3 = answers.filter((answer, i) => answer === STUDENT_3[i % STUDENT_3.length]).length;
    
    const max = Math.max(count_1, count_2, count_3);
    
    if(max === count_1) { answer.push(1); }
    if(max === count_2) { answer.push(2); }
    if(max === count_3) { answer.push(3); }
    
    return answer;
}
