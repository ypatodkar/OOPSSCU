def longest_common_substring(X, Y):
    n = len(X)
    m = len(Y)
    
    # dp[i][j] will hold the length of the longest common substring
    # ending at X[i-1] and Y[j-1].
    dp = [[0] * (m + 1) for _ in range(n + 1)]
    
    longest_length = 0
    longest_end_pos = 0  # To store the end position of the longest common substring in X
    
    for i in range(1, n + 1):
        for j in range(1, m + 1):
            if X[i-1] == Y[j-1]:
                dp[i][j] = dp[i-1][j-1] + 1
                if dp[i][j] > longest_length:
                    longest_length = dp[i][j]
                    longest_end_pos = i - 1
            else:
                dp[i][j] = 0
    
    # Extract the longest common substring from X using the recorded end position
    longest_common_substr = X[longest_end_pos - longest_length + 1 : longest_end_pos + 1]
    return longest_common_substr

# Test case
if __name__ == "__main__":
    X = "ALEBEER"
    Y = "DRINKBEER"
    result = longest_common_substring(X, Y)
    print("Longest common substring:", result)  # Expected output: "BEER"
