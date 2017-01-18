package com.enrol

class BootStrap {

    def init = { servletContext ->
	def computing = new Course(
	title:'BSc Hon Computing',
	code:'COMP234',
	leader:'Dr Mary Poppins',
	department:'Computing',
	startDate:new Date('11/11/2016'),
	endDate:new Date('11/11/2020'),
	numberOfStudents:45,
	description:'''Computing Course at Sheffield Hallam University''',
	fees:9000,
	studyMode:'Full-time'
	).save()
	def module = new Module(
	title:'System Architectures',
	code:'COMP145',
	credits:20,
	lecturer:'Tonderai',
	description:'''System Architectures module for Computing Course''',
	course:'computing'
	).save()
    }
    def destroy = {
	def lectruer = new Lectruer(
	fullName:'Dr Tonderai Maswera',
	post:'Lecturer',
	subject:'Web Applications',
	lecturerEmail:'t.maswera@shu.ac.uk',
	office:'Cantor-9417',
	bio:'''I am Tonderai'''
	).save()
    }
}
