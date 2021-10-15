const solution = (board, moves) => {
    let count = 0;
    let basket = [];
    moves.forEach(move => {
        for(let i = 0; i < board.length; i++){
            let block = board[i][move-1];
            if(block !== 0) {
                if (basket[basket.length-1] !== block) {
                    basket.push(block);
                } else {
                    basket.pop(block);
                    count += 2;                    
                }
                board[i][move-1] = 0;
                break;
            }
        }
    });    
    
    return count;
}