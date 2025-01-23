import Foundation

// 팰린드롬 여부를 확인하는 함수
func isPalindrome(_ word: String) -> Int {
    let reversedWord = String(word.reversed())
    return word == reversedWord ? 1 : 0
}

// 입력 받기
if let word = readLine() {
    print(isPalindrome(word))
}
