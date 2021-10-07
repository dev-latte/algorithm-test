const solution = (phone_number) => {
    const start = phone_number.length - 4;
    return "*".repeat(start) + phone_number.slice(start, phone_number.length) ;
}