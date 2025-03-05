#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
#include <windows.h>
using namespace std;
struct Contact {
    string name;
    string phoneNumber;
    string bloodGroup;
};
// Global variables
HINSTANCE hInst;
HWND hwndMain, hWndName, hWndPhone, hWndBloodGroup, hWndContactList, hWndAddButton, hWndSearchButton, hWndDeleteButton;
HWND hWndAddBloodButton, hWndDeleteBloodButton, hWndSearchBloodButton, hWndDisplayBloodButton, hWndExitButton;
HWND hWndDisplayContactsButton;  // New button for displaying all contacts
vector<Contact> contacts;

void addContact();
void searchContact();
void deleteContact();
void displayContacts();  // Function to display all contacts
void addBloodGroup();
void deleteBloodGroup();
void searchBloodGroup();
void displayBloodGroups();
void clearFields();
LRESULT CALLBACK WndProc(HWND, UINT, WPARAM, LPARAM);

int main() {
    const char CLASS_NAME[] = "ContactAppClass";

    WNDCLASS wc = {};
    wc.lpfnWndProc   = WndProc;
    wc.hInstance     = GetModuleHandle(nullptr);
    wc.lpszClassName = CLASS_NAME;

    if (!RegisterClass(&wc)) {
        return 0;
    }

    hwndMain = CreateWindowEx(
        0, CLASS_NAME, "Contact Management System",
        WS_OVERLAPPEDWINDOW, CW_USEDEFAULT, CW_USEDEFAULT, 500, 500,
        nullptr, nullptr, hInst, nullptr);

    if (hwndMain == nullptr) {
        return 0;
    }

    ShowWindow(hwndMain, SW_SHOWNORMAL);
    UpdateWindow(hwndMain);

    MSG msg = {};
    while (GetMessage(&msg, nullptr, 0, 0)) {
        TranslateMessage(&msg);
        DispatchMessage(&msg);
    }

    return 0;
}

// Window procedure function to handle messages and events
LRESULT CALLBACK WndProc(HWND hwnd, UINT uMsg, WPARAM wParam, LPARAM lParam) {
    switch (uMsg) {
        case WM_CREATE:
            // Create Name input field
            CreateWindow("STATIC", "Name:", WS_VISIBLE | WS_CHILD, 20, 20, 80, 20, hwnd, nullptr, hInst, nullptr);
            hWndName = CreateWindow("EDIT", "", WS_BORDER | WS_VISIBLE | WS_CHILD, 100, 20, 200, 20, hwnd, nullptr, hInst, nullptr);

            // Create Phone input field
            CreateWindow("STATIC", "Phone Number:", WS_VISIBLE | WS_CHILD, 20, 50, 100, 20, hwnd, nullptr, hInst, nullptr);
            hWndPhone = CreateWindow("EDIT", "", WS_BORDER | WS_VISIBLE | WS_CHILD, 120, 50, 180, 20, hwnd, nullptr, hInst, nullptr);

            // Create Blood Group input field
            CreateWindow("STATIC", "Blood Group:", WS_VISIBLE | WS_CHILD, 20, 80, 100, 20, hwnd, nullptr, hInst, nullptr);
            hWndBloodGroup = CreateWindow("EDIT", "", WS_BORDER | WS_VISIBLE | WS_CHILD, 120, 80, 180, 20, hwnd, nullptr, hInst, nullptr);

            // Create Buttons for all operations
            hWndAddButton = CreateWindow("BUTTON", "Add Contact", WS_VISIBLE | WS_CHILD, 20, 120, 100, 30, hwnd, (HMENU)1, hInst, nullptr);
            hWndSearchButton = CreateWindow("BUTTON", "Search Contact", WS_VISIBLE | WS_CHILD, 140, 120, 120, 30, hwnd, (HMENU)2, hInst, nullptr);
            hWndDeleteButton = CreateWindow("BUTTON", "Delete Contact", WS_VISIBLE | WS_CHILD, 280, 120, 120, 30, hwnd, (HMENU)3, hInst, nullptr);

            hWndAddBloodButton = CreateWindow("BUTTON", "Add Blood Group", WS_VISIBLE | WS_CHILD, 20, 160, 120, 30, hwnd, (HMENU)4, hInst, nullptr);
            hWndDeleteBloodButton = CreateWindow("BUTTON", "Delete Blood Group", WS_VISIBLE | WS_CHILD, 140, 160, 120, 30, hwnd, (HMENU)5, hInst, nullptr);
            hWndSearchBloodButton = CreateWindow("BUTTON", "Search Blood Group", WS_VISIBLE | WS_CHILD, 280, 160, 120, 30, hwnd, (HMENU)6, hInst, nullptr);
            hWndDisplayBloodButton = CreateWindow("BUTTON", "Display Blood Groups", WS_VISIBLE | WS_CHILD, 20, 200, 120, 30, hwnd, (HMENU)7, hInst, nullptr);

            // Create Exit Button
            hWndExitButton = CreateWindow("BUTTON", "Exit", WS_VISIBLE | WS_CHILD, 140, 200, 120, 30, hwnd, (HMENU)8, hInst, nullptr);

            // Create Display Contacts Button
            hWndDisplayContactsButton = CreateWindow("BUTTON", "Display Contacts", WS_VISIBLE | WS_CHILD, 20, 240, 120, 30, hwnd, (HMENU)9, hInst, nullptr);

            // Create listbox to display contacts
            hWndContactList = CreateWindow("LISTBOX", "", WS_VISIBLE | WS_CHILD | LBS_STANDARD, 20, 280, 440, 200, hwnd, nullptr, hInst, nullptr);

            break;

        case WM_COMMAND:
            switch (LOWORD(wParam)) {
                case 1:  // Add Contact
                    addContact();
                    break;

                case 2:  // Search Contact
                    searchContact();
                    break;

                case 3:  // Delete Contact
                    deleteContact();
                    break;

                case 4:  // Add Blood Group
                    addBloodGroup();
                    break;

                case 5:  // Delete Blood Group
                    deleteBloodGroup();
                    break;

                case 6:  // Search Blood Group
                    searchBloodGroup();
                    break;

                case 7:  // Display Blood Groups
                    displayBloodGroups();
                    break;

                case 8:  // Exit
                    PostQuitMessage(0);
                    break;

                case 9:  // Display Contacts
                    displayContacts();
                    break;
            }
            break;

        case WM_DESTROY:
            PostQuitMessage(0);
            break;

        default:
            return DefWindowProc(hwnd, uMsg, wParam, lParam);
    }
    return 0;
}

void addContact() {
    char name[100], phone[100], bloodGroup[10];
    GetWindowText(hWndName, name, 100);
    GetWindowText(hWndPhone, phone, 100);
    GetWindowText(hWndBloodGroup, bloodGroup, 10);

    Contact newContact;
    newContact.name = string(name);
    newContact.phoneNumber = string(phone);
    newContact.bloodGroup = string(bloodGroup);

    contacts.push_back(newContact);
    clearFields();
}

void searchContact() {
    char name[100];
    GetWindowText(hWndName, name, 100);

    string searchName(name);
    auto it = find_if(contacts.begin(), contacts.end(), [&](const Contact& c) {
        return c.name == searchName;
    });

    if (it != contacts.end()) {
        string contactInfo = "Found: " + it->name + ", Phone: " + it->phoneNumber + ", Blood Group: " + it->bloodGroup;
        MessageBox(hwndMain, contactInfo.c_str(), "Search Result", MB_OK);
    } else {
        MessageBox(hwndMain, "Contact not found!", "Search Result", MB_OK);
    }
}
void deleteContact() {
    char name[100];
    GetWindowText(hWndName, name, 100);
    string deleteName(name);
    auto it = remove_if(contacts.begin(), contacts.end(), [&](const Contact& c) {
        return c.name == deleteName;
    });
    if (it != contacts.end()) {
        contacts.erase(it, contacts.end());
        MessageBox(hwndMain, "Contact deleted successfully!", "Delete Result", MB_OK);
    } else {
        MessageBox(hwndMain, "Contact not found!", "Delete Result", MB_OK);
    }
}
void displayContacts() {
    SendMessage(hWndContactList, LB_RESETCONTENT, 0, 0);  // Clear the listbox
    for (const auto& contact : contacts) {
        string contactStr = contact.name + " | " + contact.phoneNumber + " | " + contact.bloodGroup;
        SendMessage(hWndContactList, LB_ADDSTRING, 0, (LPARAM)contactStr.c_str());
    }
}
void addBloodGroup() {
    char name[100], bloodGroup[10];
    GetWindowText(hWndName, name, 100);
    GetWindowText(hWndBloodGroup, bloodGroup, 10);

    string contactName(name);
    string newBloodGroup(bloodGroup);

    auto it = find_if(contacts.begin(), contacts.end(), [&](const Contact& c) {
        return c.name == contactName;
    });

    if (it != contacts.end()) {
        it->bloodGroup = newBloodGroup;
        MessageBox(hwndMain, "Blood group updated successfully!", "Update Result", MB_OK);
    } else {
        MessageBox(hwndMain, "Contact not found!", "Update Result", MB_OK);
    }
}
void deleteBloodGroup() {
    char name[100];
    GetWindowText(hWndName, name, 100);
    string contactName(name);
    auto it = find_if(contacts.begin(), contacts.end(), [&](const Contact& c) {
        return c.name == contactName;
    });
    if (it != contacts.end()) {
        it->bloodGroup = "";
        MessageBox(hwndMain, "Blood group deleted successfully!", "Delete Result", MB_OK);
    } else {
        MessageBox(hwndMain, "Contact not found!", "Delete Result", MB_OK);
    }
}
void searchBloodGroup() {
    char bloodGroup[10];
    GetWindowText(hWndBloodGroup, bloodGroup, 10);

    string searchBloodGroup(bloodGroup);
    auto it = find_if(contacts.begin(), contacts.end(), [&](const Contact& c) {
        return c.bloodGroup == searchBloodGroup;
    });

    if (it != contacts.end()) {
        string contactInfo = "Found: " + it->name + ", Phone: " + it->phoneNumber + ", Blood Group: " + it->bloodGroup;
        MessageBox(hwndMain, contactInfo.c_str(), "Search Result", MB_OK);
    } else {
        MessageBox(hwndMain, "Blood group not found!", "Search Result", MB_OK);
    }
}

void displayBloodGroups() {
    string bloodGroups = "Blood Groups:\n";
    for (const auto& contact : contacts) {
        if (!contact.bloodGroup.empty()) {
            bloodGroups += contact.bloodGroup + "\n";
        }
    }

    MessageBox(hwndMain, bloodGroups.c_str(), "Blood Groups", MB_OK);
}

void clearFields() {
    SetWindowText(hWndName, "");
    SetWindowText(hWndPhone, "");
    SetWindowText(hWndBloodGroup, "");
}