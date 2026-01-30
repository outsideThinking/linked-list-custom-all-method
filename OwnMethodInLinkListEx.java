import java.util.Scanner;
class Node{
int data;
Node next;
Node(int data){
this.data=data;
}
}
class linkedList{
Node head=null;
Node tail=null;
int size=0;

public void insertAtBegining(int val){
Node temp=new Node(val);
if(head==null){
insertAtEnd(val);
size++;
}
else{
temp.next=head;
head=temp;
size++;
}
}

public void insertAtEnd(int val){
Node temp=new Node(val);
if(head==null){
head=temp;
tail=temp;
size++;
}
else{
tail.next=temp;
tail=temp;
size++;
}
}

public void insertAtGivenIndex(int idx, int val){
Node temp=new Node(val);
Node itr=head;
if(head==null){
insertAtEnd(val);
size++;
}
else{
for(int i=0;i<idx;i++){
itr=itr.next;
}
temp.next=itr.next;
itr.next=temp;
size++;
}
}

public void deleteAtBegining(){
if(head==null){
System.out.println("linked list is blank");
return;
}
else{
head=head.next;
size--;
}
}

public void findSize(){
System.out.println(size);
}

public void deleteAtEnd(){
Node itr=head;
if(head==null){
System.out.println("Linked list is blank");
return;
}
else{
for(int i=1;i<size-1;i++){
itr=itr.next;
}
itr.next=null;
itr=tail;
}
}

public void deleteAtGivenIndex(int idx){
Node itr=head;
for(int i=1;i<idx;i++){
itr=itr.next;
}
itr.next=itr.next.next;
}

public void isEmpty(){
if(head==null){
System.out.println("It is empty");
}
else{
System.out.println("It is not empty");
}
}

public void getFirstEle(){
Node temp=head;
if(head==null){
System.out.println("linked list in the not any elment");
return;
}
else{
System.out.println("first element is: "+temp.data);
}
}

public void getLastEle(){
Node temp=tail;
if(head==null){
System.out.println("linked list in the not any element");
}
else{
System.out.println("Last element is: "+temp.data);
}
}

public void getGivenIndex(int idx){
Node itr=head;
if(head==null){
System.out.println("linked list in the not any elment");
}
else{
for(int i=0;i<idx;i++){
itr=itr.next;
}
System.out.println(idx+" index of element is: "+itr.data);
}
}

public void search(int val){
Node itr=head;
if(head==null){
System.out.println("linked list in the not present any elment");
return;
}
else{
while(itr!=null){
if(itr.data!=val){
itr=itr.next;
}
else{
System.out.println(itr.data+" is present in the linked list ");
return;
}
}
}
}

public void searchAndReplace(int oldVal, int newVal){
Node itr=head;
if(head==null){
System.out.println("linked list in the not present any element");
return;
}
while(itr!=null){
if(itr.data==oldVal){
itr.data=newVal;
}
itr=itr.next;
}
}


void display(){
Node temp=head;
while(temp!=null){
System.out.print(temp.data+" ");
temp=temp.next;
}
}
}

class OwnMethodInLinkListEx{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int val;
linkedList ll=new linkedList();
int choice, insertChoice;
int deleteChoice;
int getChoice;
int searchEl;
do{
System.out.println("----------linked list of menu----------");
System.out.println("1. Insert ");
System.out.println("2. Delete ");
System.out.println("3. IsEmpty ");
System.out.println("4. Get element ");
System.out.println("5. Serch ");
System.out.println("6. display ");

System.out.print("Enter your choice: ");
choice=sc.nextInt();
switch(choice){
case 1:
System.out.println("1. Insert at begning: ");
System.out.println("2. Insert at end: ");
System.out.println("3. Insert at given index: ");
insertChoice=sc.nextInt();

switch(insertChoice){
case 1:
System.out.print("Enter the begining at value: ");
val=sc.nextInt();
ll.insertAtBegining(val);
break;

case 2:
System.out.println("Enter the end at value: ");
val=sc.nextInt();
ll.insertAtEnd(val);
break;

case 3:
System.out.println("Enter the given index: ");
int idx=sc.nextInt();
System.out.println("Enter the value: ");
val=sc.nextInt();
ll.insertAtGivenIndex(idx, val);
break;

default:
System.out.println("Invalid choice try again ");
}
break;

case 2:
System.out.println("1. Delete at end: ");
System.out.println("2. Delete at begining: ");
System.out.println("3. Delete at given index: ");
deleteChoice=sc.nextInt();
switch(deleteChoice){
case 1:
ll.deleteAtEnd();
break;
case 2:
ll.deleteAtBegining();
break;
case 3:
System.out.println("Enter the index where do you want to delete: ");
int didx=sc.nextInt();
ll.getGivenIndex(didx);
break;
default :
System.out.println("Invalid choice try again ");
}
break;
case 3:
System.out.println("linked list is empty: ");
choice=sc.nextInt();
ll.isEmpty();
break;
case 4:
System.out.println("get first element: ");
System.out.println("get the last element: ");
System.out.println("get the given element: ");
getChoice=sc.nextInt();
switch(getChoice){
case 1:
ll.getFirstEle();
break;
case 2:
ll.getLastEle();
break;
case 3:
System.out.println("Enter the index to print the element: ");
int getIdx=sc.nextInt();
ll.getGivenIndex(getIdx);
break;
default :
System.out.println("Invalid choice try again ");
}
break;

case 5:
System.out.println("1. Only search: ");
System.out.println("2. search and replace: ");
searchEl=sc.nextInt();
switch(searchEl){
case 1:
System.out.println("Enter the element which do you want to search: ");
int onlySearch=sc.nextInt();
ll.search(onlySearch);
break;
case 2:
System.out.println("Enter the element which do you want to search: ");
int seachEle=sc.nextInt();
System.out.println("Enter the element which do you want to replace: ");
int searchRepEle=sc.nextInt();
ll.searchAndReplace(seachEle,searchRepEle);
break;
default :
System.out.println("Invalid choice please try again");
break;
}
break;
case 6:
ll.display();
break;
default:
System.out.println("Invalid choice please try again ");
break;
}
}
while(choice !=7);

}}
