/**
 *  Dada uma data em formato dd/MM/yyyy, extrair os dados e exibir em formato numérico
 *  @param(date: String) 
 *  @return (numericParts: Object) 
 */
function extractDateInfo(date) {
    let numericParts = date.split("/").map(d => parseInt(d));
    return { day: numericParts[0], month: numericParts[1], year: numericParts[2] };
}

/**
 *  Recebe um objeto com as chaves day, month e year.
 *  @param(Object) Objeto contendo uma chave day, month e year. 
 *  @return (void)
 */
function showDate(date) {
    console.log(`Dia: ${date?.day}`);
    console.log(`Mês: ${date?.month}`);
    console.log(`Ano: ${date?.year}`);
}

showDate(extractDateInfo("15/07/2025"));
showDate(extractDateInfo("05/01/1025"));