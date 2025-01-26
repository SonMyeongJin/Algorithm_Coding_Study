import Foundation

// 입력받기
if let input = readLine() {
    let word = input.uppercased() // 대문자로 변환
    var frequency = [Character: Int]() // 알파벳 빈도 저장

    // 빈도 계산
    for char in word {
        if char.isLetter { // 알파벳만 처리
            frequency[char, default: 0] += 1
        }
    }

    // 가장 높은 빈도 찾기
    let maxFrequency = frequency.values.max() ?? 0
    let mostFrequent = frequency.filter { $0.value == maxFrequency }.keys

    // 결과 출력
    if mostFrequent.count > 1 {
        print("?")
    } else if let result = mostFrequent.first {
        print(result)
    }
}
