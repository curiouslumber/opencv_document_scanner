import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'OpenCV Document Scanner',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
      ),
      home: Scaffold(
        appBar: AppBar(title: Text('OpenCV Document Scanner')),
        body: Container(
          alignment: Alignment.bottomRight,
          padding: EdgeInsets.only(bottom: 32.0, right: 32.0),
          child: FloatingActionButton(onPressed: () {}, child: Icon(Icons.add)),
        ),
      ),
    );
  }
}
