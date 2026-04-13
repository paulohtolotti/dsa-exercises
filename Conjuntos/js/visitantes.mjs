/**
 * Exercício contagem de visitantes únicos.
 * Dado um arquivo csv (./dados.mjs), contar quantos visitantes únicos existem
 */
import { dataset } from './dados.mjs';

function calculateUniqueVisitors(data) {
    let set = new Set();

    for(const d of data) {
        let visitor = d.split(",")[0];
        set.add(visitor);
    }

    return set.size;
}

function scenario(data) {
    const size = calculateUniqueVisitors(data);
    process.stdout.write(`${size} unique visitors\n`);
}
const data = [
    "ana,2024-07-04T21:42:40.353283800Z,https://blog.com/login",
    "bob,2024-07-04T21:42:44.571283800Z,https://blog.com/news",
    "maria,2024-07-04T21:42:46.394283800Z,https://blog.com/shop",
    "ana,2024-07-04T21:42:50.026283800Z,https://blog.com/news"
];

scenario(data);
scenario(dataset);