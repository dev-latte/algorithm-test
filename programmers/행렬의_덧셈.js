const solution = (arr1, arr2) => {
    return arr1.map((el,i) => 
                        el.map((num, j) => 
                           num + arr2[i][j]
                        )
                    );
}