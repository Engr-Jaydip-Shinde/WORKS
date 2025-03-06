let account = {
    name: "",
    balance: 0
};

function showCreateAccount() {
    document.getElementById("account-section").classList.remove("hidden");
    document.getElementById("menu").classList.add("hidden");
}

function createAccount() {
    let name = document.getElementById("account-name").value;
    let initialBalance = parseFloat(document.getElementById("initial-balance").value);

    if (name === "" || isNaN(initialBalance) || initialBalance < 0) {
        alert("Enter valid details!");
        return;
    }

    account.name = name;
    account.balance = initialBalance;

    document.getElementById("user-name").textContent = account.name;
    document.getElementById("balance").textContent = account.balance.toFixed(2);

    document.getElementById("account-section").classList.add("hidden");
    document.getElementById("account-btn").disabled = false;
}

function showOptions() {
    document.getElementById("operations-section").classList.remove("hidden");
    document.getElementById("menu").classList.add("hidden");
}

function checkBalance() {
    alert(`Your balance is ₹${account.balance.toFixed(2)}`);
}

function showDeposit() {
    document.getElementById("transaction-title").textContent = "Deposit Money";
    document.getElementById("transaction-section").classList.remove("hidden");
    document.getElementById("operations-section").classList.add("hidden");
}

function showWithdraw() {
    document.getElementById("transaction-title").textContent = "Withdraw Money";
    document.getElementById("transaction-section").classList.remove("hidden");
    document.getElementById("operations-section").classList.add("hidden");
}

function performTransaction() {
    let amount = parseFloat(document.getElementById("amount").value);
    let transactionType = document.getElementById("transaction-title").textContent;

    if (isNaN(amount) || amount <= 0) {
        alert("Enter a valid amount.");
        return;
    }

    if (transactionType === "Deposit Money") {
        account.balance += amount;
    } else if (transactionType === "Withdraw Money") {
        if (amount > account.balance) {
            alert("Insufficient balance!");
            return;
        }
        account.balance -= amount;
    }

    document.getElementById("balance").textContent = account.balance.toFixed(2);
    alert(`Transaction successful! Your new balance is ₹${account.balance.toFixed(2)}`);

    goBack();
}

function goBack() {
    document.getElementById("transaction-section").classList.add("hidden");
    document.getElementById("operations-section").classList.remove("hidden");
    document.getElementById("amount").value = "";
}

function logout() {
    alert("Thank you for using our ATM!");
    location.reload();
}

function enterDigit(digit) {
    document.getElementById("amount").value += digit;
}

function clearAmount() {
    document.getElementById("amount").value = "";
}

function submitAmount() {
    performTransaction();
}
