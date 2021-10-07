const solution = (table, languages, preference) => {
    const result = table.map(el => el.split(" "))
                        .map(el => [el[0], el.map((value, index) => languages.includes(value) ? preference[languages.indexOf(value)] * (6 - index) : 0)
                                                .reduce((a, b) => a + b)])
                        .sort((a, b) => b[1] - a[1] - (a[0] < b[0])); // 문자열에 비교연산자를 사용하는 경우, 아스키코드값을 비교하여 결과 리턴
    return result[0][0];
}