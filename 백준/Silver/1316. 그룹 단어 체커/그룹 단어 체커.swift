import Foundation

let n = Int(readLine()!)!
var count = 0

for _ in 0..<n {
    let word = readLine()!
    var seen: Set<Character> = []
    var isGroupWord = true
    var prevChar: Character?

    for char in word {
        if char != prevChar {
            if seen.contains(char) {
                isGroupWord = false
                break
            }
            seen.insert(char)
        }
        prevChar = char
    }

    if isGroupWord {
        count += 1
    }
}

print(count)
